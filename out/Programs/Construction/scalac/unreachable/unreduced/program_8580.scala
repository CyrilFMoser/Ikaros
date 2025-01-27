package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[((Byte,Boolean),T_A[(Boolean,Int)])]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[((Byte,Boolean),T_A[(Boolean,Int)])]
case class CC_C(a: T_A[T_B[Boolean]], b: T_B[CC_B], c: CC_B) extends T_A[((Byte,Boolean),T_A[(Boolean,Int)])]

val v_a: T_A[((Byte,Boolean),T_A[(Boolean,Int)])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _)