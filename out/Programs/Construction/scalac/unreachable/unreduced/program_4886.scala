package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[T_B[Byte], (T_B[(Char,Boolean)],(Char,Char))]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_B[Byte], (T_B[(Char,Boolean)],(Char,Char))]

val v_a: T_A[T_B[Byte], (T_B[(Char,Boolean)],(Char,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}