package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: (T_A,((Byte,Char),CC_A)), b: (T_A,Byte), c: T_A) extends T_A
case class CC_C(a: CC_A, b: T_B[Int]) extends T_B[T_A]
case class CC_D(a: CC_A) extends T_B[T_A]
case class CC_E[B](a: Char, b: T_B[T_A]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_D(_) => 1 
  case CC_E(_, _) => 2 
}
}