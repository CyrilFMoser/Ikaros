package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Char], T_A[(Boolean,Char), (Char,Int)]]]
case class CC_B() extends T_A[(Byte,CC_A[Byte]), T_A[T_A[Int, Char], T_A[(Boolean,Char), (Char,Int)]]]

val v_a: T_A[(Byte,CC_A[Byte]), T_A[T_A[Int, Char], T_A[(Boolean,Char), (Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}