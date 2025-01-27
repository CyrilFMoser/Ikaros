package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: (Int,T_A)) extends T_A
case class CC_B(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_C(a: T_B[Int]) extends T_A
case class CC_D(a: CC_A, b: T_A) extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]
case class CC_F(a: CC_B, b: CC_E, c: T_B[Byte]) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 1 
  case CC_B(CC_A(_, _), (CC_A(_, _),CC_B(_, _))) => 2 
  case CC_B(CC_A(_, _), (CC_B(_, _),CC_A(_, _))) => 3 
  case CC_B(CC_A(_, _), (CC_B(_, _),CC_B(_, _))) => 4 
  case CC_B(CC_A(_, _), (CC_B(_, _),CC_C(_))) => 5 
  case CC_B(CC_A(_, _), (CC_C(_),CC_A(_, _))) => 6 
  case CC_B(CC_A(_, _), (CC_C(_),CC_B(_, _))) => 7 
  case CC_B(CC_A(_, _), (CC_C(_),CC_C(_))) => 8 
  case CC_B(CC_B(_, _), (CC_A(_, _),CC_A(_, _))) => 9 
  case CC_B(CC_B(_, _), (CC_A(_, _),CC_B(_, _))) => 10 
  case CC_B(CC_B(_, _), (CC_A(_, _),CC_C(_))) => 11 
  case CC_B(CC_B(_, _), (CC_B(_, _),CC_A(_, _))) => 12 
  case CC_B(CC_B(_, _), (CC_B(_, _),CC_B(_, _))) => 13 
  case CC_B(CC_B(_, _), (CC_B(_, _),CC_C(_))) => 14 
  case CC_B(CC_B(_, _), (CC_C(_),CC_A(_, _))) => 15 
  case CC_B(CC_B(_, _), (CC_C(_),CC_B(_, _))) => 16 
  case CC_B(CC_B(_, _), (CC_C(_),CC_C(_))) => 17 
  case CC_B(CC_C(_), (CC_A(_, _),CC_A(_, _))) => 18 
  case CC_B(CC_C(_), (CC_A(_, _),CC_B(_, _))) => 19 
  case CC_B(CC_C(_), (CC_A(_, _),CC_C(_))) => 20 
  case CC_B(CC_C(_), (CC_B(_, _),CC_A(_, _))) => 21 
  case CC_B(CC_C(_), (CC_B(_, _),CC_B(_, _))) => 22 
  case CC_B(CC_C(_), (CC_B(_, _),CC_C(_))) => 23 
  case CC_B(CC_C(_), (CC_C(_),CC_A(_, _))) => 24 
  case CC_B(CC_C(_), (CC_C(_),CC_B(_, _))) => 25 
  case CC_B(CC_C(_), (CC_C(_),CC_C(_))) => 26 
  case CC_C(_) => 27 
}
}
// This is not matched: CC_B(CC_A(_, _), (CC_A(_, _),CC_C(_)))