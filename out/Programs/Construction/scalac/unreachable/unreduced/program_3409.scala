package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[((Boolean,Boolean),T_A[Byte])]
case class CC_B(a: CC_A, b: Int, c: T_A[CC_A]) extends T_A[((Boolean,Boolean),T_A[Byte])]
case class CC_C(a: CC_A) extends T_A[((Boolean,Boolean),T_A[Byte])]

val v_a: T_A[((Boolean,Boolean),T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}
// This is not matched: CC_C(CC_A())