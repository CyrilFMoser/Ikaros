package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B[CC_C, (CC_B,Boolean)], b: T_B[CC_C, (CC_B,Boolean)], c: ((Boolean,T_A),CC_C)) extends T_B[CC_C, (CC_B,Boolean)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_A(_, _)) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_B(_)) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_B(_)), CC_C(CC_A(_, _))) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, _)) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_B(_)) => 7 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_C(CC_A(_, _))) => 8 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_A(_, _)) => 9 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_B(_)) => 10 
  case CC_A(CC_A(CC_B(_), CC_A(_, _)), CC_C(CC_A(_, _))) => 11 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_A(_, _)) => 12 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_B(_)) => 13 
  case CC_A(CC_A(CC_B(_), CC_B(_)), CC_C(CC_A(_, _))) => 14 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_A(_, _)) => 15 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_B(_)) => 16 
  case CC_A(CC_A(CC_B(_), CC_C(_)), CC_C(CC_A(_, _))) => 17 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, _)) => 18 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B(_)) => 19 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_C(CC_A(_, _))) => 20 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_A(_, _)) => 21 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_B(_)) => 22 
  case CC_A(CC_A(CC_C(_), CC_B(_)), CC_C(CC_A(_, _))) => 23 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, _)) => 24 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_B(_)) => 25 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_C(CC_A(_, _))) => 26 
  case CC_A(CC_B(_), CC_A(_, _)) => 27 
  case CC_A(CC_B(_), CC_B(_)) => 28 
  case CC_A(CC_B(_), CC_C(CC_A(_, _))) => 29 
  case CC_A(CC_C(CC_A(_, _)), CC_A(_, _)) => 30 
  case CC_A(CC_C(CC_A(_, _)), CC_B(_)) => 31 
  case CC_A(CC_C(CC_A(_, _)), CC_C(CC_A(_, _))) => 32 
  case CC_B(_) => 33 
  case CC_C(_) => 34 
}
}