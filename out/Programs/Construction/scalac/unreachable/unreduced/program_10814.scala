package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: CC_A, c: (T_A[CC_A],CC_A)) extends T_A[Char]
case class CC_C(a: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(CC_A(_))) => 4 
  case CC_A(CC_C(CC_B(_, _, _))) => 5 
  case CC_A(CC_C(CC_C(_))) => 6 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_A(_)), (_,CC_A(_))) => 7 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_A(_)), (_,CC_A(_))) => 8 
  case CC_B(CC_A(CC_C(_)), CC_A(CC_A(_)), (_,CC_A(_))) => 9 
  case CC_B(CC_B(CC_A(_), CC_A(_), (_,_)), CC_A(CC_A(_)), (_,CC_A(_))) => 10 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), (_,_)), CC_A(CC_A(_)), (_,CC_A(_))) => 11 
  case CC_B(CC_B(CC_C(_), CC_A(_), (_,_)), CC_A(CC_A(_)), (_,CC_A(_))) => 12 
  case CC_B(CC_C(CC_A(_)), CC_A(CC_A(_)), (_,CC_A(_))) => 13 
  case CC_B(CC_C(CC_B(_, _, _)), CC_A(CC_A(_)), (_,CC_A(_))) => 14 
  case CC_B(CC_C(CC_C(_)), CC_A(CC_A(_)), (_,CC_A(_))) => 15 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 16 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 17 
  case CC_B(CC_A(CC_C(_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 18 
  case CC_B(CC_B(CC_A(_), CC_A(_), (_,_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 19 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), (_,_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 20 
  case CC_B(CC_B(CC_C(_), CC_A(_), (_,_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 21 
  case CC_B(CC_C(CC_A(_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 22 
  case CC_B(CC_C(CC_B(_, _, _)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 23 
  case CC_B(CC_C(CC_C(_)), CC_A(CC_B(_, _, _)), (_,CC_A(_))) => 24 
  case CC_B(CC_A(CC_A(_)), CC_A(CC_C(_)), (_,CC_A(_))) => 25 
  case CC_B(CC_A(CC_B(_, _, _)), CC_A(CC_C(_)), (_,CC_A(_))) => 26 
  case CC_B(CC_A(CC_C(_)), CC_A(CC_C(_)), (_,CC_A(_))) => 27 
  case CC_B(CC_B(CC_A(_), CC_A(_), (_,_)), CC_A(CC_C(_)), (_,CC_A(_))) => 28 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(_), (_,_)), CC_A(CC_C(_)), (_,CC_A(_))) => 29 
  case CC_B(CC_B(CC_C(_), CC_A(_), (_,_)), CC_A(CC_C(_)), (_,CC_A(_))) => 30 
  case CC_B(CC_C(CC_A(_)), CC_A(CC_C(_)), (_,CC_A(_))) => 31 
  case CC_B(CC_C(CC_B(_, _, _)), CC_A(CC_C(_)), (_,CC_A(_))) => 32 
  case CC_B(CC_C(CC_C(_)), CC_A(CC_C(_)), (_,CC_A(_))) => 33 
  case CC_C(CC_A(_)) => 34 
  case CC_C(CC_B(_, _, _)) => 35 
  case CC_C(CC_C(CC_A(_))) => 36 
  case CC_C(CC_C(CC_B(_, _, _))) => 37 
  case CC_C(CC_C(CC_C(_))) => 38 
}
}