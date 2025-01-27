package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Byte]]) extends T_A[(T_A[Boolean],(Boolean,Byte))]
case class CC_B() extends T_A[(T_A[Boolean],(Boolean,Byte))]
case class CC_C(a: T_A[T_A[(Char,Char)]], b: (Byte,CC_B)) extends T_A[(T_A[Boolean],(Boolean,Byte))]

val v_a: T_A[(T_A[Boolean],(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (0,CC_B())) => 1 
  case CC_C(_, (_,CC_B())) => 2 
}
}
// This is not matched: CC_A(_, _)