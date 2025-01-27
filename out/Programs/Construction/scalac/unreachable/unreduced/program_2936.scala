package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_A[T_B, T_B], T_A[Boolean, T_B]], c: T_A[T_B, T_A[(Byte,Byte), T_B]]) extends T_A[Byte, Int]
case class CC_B(a: T_A[Byte, Int], b: Char) extends T_A[Byte, Int]
case class CC_C(a: (CC_B,CC_B), b: T_B) extends T_B
case class CC_D(a: CC_A, b: Char, c: (CC_C,CC_A)) extends T_B
case class CC_E(a: T_A[Byte, Int], b: Char) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_C(_, CC_C(_, _))) => 0 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_C(_, CC_D(_, _, _))) => 1 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_C(_, CC_E(_, _))) => 2 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_D(CC_A(_, _, _), _, (_,_))) => 3 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_E(_, 'x')) => 4 
  case CC_C((CC_B(_, _),CC_B(_, _)), CC_E(_, _)) => 5 
}
}