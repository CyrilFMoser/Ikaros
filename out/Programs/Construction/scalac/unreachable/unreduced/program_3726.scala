package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: Char) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: CC_A, c: CC_A) extends T_A
case class CC_D(a: Int, b: CC_B, c: CC_B) extends T_B[T_B[T_B[Char]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _), CC_A(_, _)) => 2 
}
}