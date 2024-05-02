﻿using System;
using System.Collections.Generic;

namespace DC_Lab1.Models;

public partial class Marker
{
    public int Id { get; set; }

    public string? name { get; set; }

    public virtual ICollection<TweetMarker> TweetMarkers { get; set; } = new List<TweetMarker>();

}
