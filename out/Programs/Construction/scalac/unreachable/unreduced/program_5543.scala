package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[(Int,Int)], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_A(CC_B(_), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 3 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 4 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 5 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 6 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 7 
  case CC_A(CC_B(_), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 8 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 9 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 10 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 11 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 12 
  case CC_A(CC_B(_), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 13 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 14 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 15 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 16 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 17 
  case CC_A(CC_B(_), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 18 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 19 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_B(_))) => 20 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_B(_), _, CC_B(_))) => 21 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(_), _, CC_B(_))) => 22 
  case CC_A(CC_B(_), _, CC_A(CC_B(_), _, CC_B(_))) => 23 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_B(_))) => 24 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_C(_))) => 25 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_B(_), _, CC_C(_))) => 26 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(_), _, CC_C(_))) => 27 
  case CC_A(CC_B(_), _, CC_A(CC_B(_), _, CC_C(_))) => 28 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_C(_))) => 29 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 30 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 31 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 32 
  case CC_A(CC_B(_), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 33 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 34 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_B(_))) => 35 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_C(_), _, CC_B(_))) => 36 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_B(_))) => 37 
  case CC_A(CC_B(_), _, CC_A(CC_C(_), _, CC_B(_))) => 38 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_B(_))) => 39 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_C(_))) => 40 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_A(CC_C(_), _, CC_C(_))) => 41 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_C(_))) => 42 
  case CC_A(CC_B(_), _, CC_A(CC_C(_), _, CC_C(_))) => 43 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_C(_))) => 44 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_B(CC_A(_, _, _))) => 45 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_B(CC_A(_, _, _))) => 46 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_B(CC_A(_, _, _))) => 47 
  case CC_A(CC_B(_), _, CC_B(CC_A(_, _, _))) => 48 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_B(CC_A(_, _, _))) => 49 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_B(CC_B(_))) => 50 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_B(CC_B(_))) => 51 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_B(CC_B(_))) => 52 
  case CC_A(CC_B(_), _, CC_B(CC_B(_))) => 53 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_B(CC_B(_))) => 54 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_B(CC_C(_))) => 55 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_B(CC_C(_))) => 56 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_B(CC_C(_))) => 57 
  case CC_A(CC_B(_), _, CC_B(CC_C(_))) => 58 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_B(CC_C(_))) => 59 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_C(CC_A(_, _, _))) => 60 
  case CC_A(CC_A(_, _, CC_B(_)), _, CC_C(CC_A(_, _, _))) => 61 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_C(CC_A(_, _, _))) => 62 
  case CC_A(CC_B(_), _, CC_C(CC_A(_, _, _))) => 63 
  case CC_A(CC_C(CC_A(_, _, _)), _, CC_C(CC_A(_, _, _))) => 64 
  case CC_B(CC_A(_, _, _)) => 65 
  case CC_B(CC_B(CC_A(_, _, _))) => 66 
  case CC_B(CC_B(CC_B(_))) => 67 
  case CC_B(CC_B(CC_C(_))) => 68 
  case CC_B(CC_C(CC_A(_, _, _))) => 69 
  case CC_C(_) => 70 
}
}