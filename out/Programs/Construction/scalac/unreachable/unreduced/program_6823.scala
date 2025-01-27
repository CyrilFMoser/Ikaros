package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[(Byte,Byte)], c: T_A[T_A[Byte]]) extends T_A[(T_A[Byte],(Boolean,Boolean))]
case class CC_B() extends T_A[(T_A[Byte],(Boolean,Boolean))]
case class CC_C(a: CC_A, b: T_A[Byte], c: CC_A) extends T_A[(T_A[Byte],(Boolean,Boolean))]

val v_a: T_A[(T_A[Byte],(Boolean,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}