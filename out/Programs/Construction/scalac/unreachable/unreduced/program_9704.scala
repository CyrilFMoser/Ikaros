package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Char) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Boolean, b: CC_B) extends T_B[(Int,((Boolean,Byte),CC_C)), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C() => 2 
}
}