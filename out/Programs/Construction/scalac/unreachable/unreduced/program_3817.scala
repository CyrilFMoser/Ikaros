package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Int]], b: T_B[T_B[Boolean, Int], Boolean]) extends T_A[((Boolean,Int),Char)]
case class CC_B() extends T_A[((Boolean,Int),Char)]
case class CC_C() extends T_A[((Boolean,Int),Char)]

val v_a: T_A[((Boolean,Int),Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}