package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Byte,Byte), T_A], Byte]) extends T_A
case class CC_B(a: T_B[Boolean, T_B[(Char,Char), Boolean]]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[Int, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)