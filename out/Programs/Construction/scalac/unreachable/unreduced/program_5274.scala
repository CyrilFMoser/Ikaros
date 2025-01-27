package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: (T_A[T_B],T_A[T_B]), c: T_A[Byte]) extends T_A[T_B]
case class CC_D(a: T_A[T_B], b: CC_B, c: T_A[CC_B]) extends T_B
case class CC_E(a: T_A[(Boolean,CC_C)], b: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_A(), (CC_A(),CC_A()), _) => 2 
  case CC_C(CC_B(), (CC_A(),CC_A()), _) => 3 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_A(),CC_A()), _) => 4 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_A(),CC_A()), _) => 5 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_A(),CC_A()), _) => 6 
  case CC_C(CC_A(), (CC_A(),CC_B()), _) => 7 
  case CC_C(CC_B(), (CC_A(),CC_B()), _) => 8 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_A(),CC_B()), _) => 9 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_A(),CC_B()), _) => 10 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_A(),CC_B()), _) => 11 
  case CC_C(CC_A(), (CC_A(),CC_C(_, _, _)), _) => 12 
  case CC_C(CC_B(), (CC_A(),CC_C(_, _, _)), _) => 13 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_A(),CC_C(_, _, _)), _) => 14 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_A(),CC_C(_, _, _)), _) => 15 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_A(),CC_C(_, _, _)), _) => 16 
  case CC_C(CC_A(), (CC_B(),CC_A()), _) => 17 
  case CC_C(CC_B(), (CC_B(),CC_A()), _) => 18 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_B(),CC_A()), _) => 19 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_B(),CC_A()), _) => 20 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_B(),CC_A()), _) => 21 
  case CC_C(CC_A(), (CC_B(),CC_B()), _) => 22 
  case CC_C(CC_B(), (CC_B(),CC_B()), _) => 23 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_B(),CC_B()), _) => 24 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_B(),CC_B()), _) => 25 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_B(),CC_B()), _) => 26 
  case CC_C(CC_A(), (CC_B(),CC_C(_, _, _)), _) => 27 
  case CC_C(CC_B(), (CC_B(),CC_C(_, _, _)), _) => 28 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_B(),CC_C(_, _, _)), _) => 29 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_B(),CC_C(_, _, _)), _) => 30 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_B(),CC_C(_, _, _)), _) => 31 
  case CC_C(CC_A(), (CC_C(_, _, _),CC_A()), _) => 32 
  case CC_C(CC_B(), (CC_C(_, _, _),CC_A()), _) => 33 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_C(_, _, _),CC_A()), _) => 34 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_C(_, _, _),CC_A()), _) => 35 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_C(_, _, _),CC_A()), _) => 36 
  case CC_C(CC_A(), (CC_C(_, _, _),CC_B()), _) => 37 
  case CC_C(CC_B(), (CC_C(_, _, _),CC_B()), _) => 38 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_C(_, _, _),CC_B()), _) => 39 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_C(_, _, _),CC_B()), _) => 40 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_C(_, _, _),CC_B()), _) => 41 
  case CC_C(CC_A(), (CC_C(_, _, _),CC_C(_, _, _)), _) => 42 
  case CC_C(CC_B(), (CC_C(_, _, _),CC_C(_, _, _)), _) => 43 
  case CC_C(CC_C(CC_A(), (_,_), _), (CC_C(_, _, _),CC_C(_, _, _)), _) => 44 
  case CC_C(CC_C(CC_B(), (_,_), _), (CC_C(_, _, _),CC_C(_, _, _)), _) => 45 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (CC_C(_, _, _),CC_C(_, _, _)), _) => 46 
}
}