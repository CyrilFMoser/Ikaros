package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_B(a: (Boolean,CC_A), b: Int) extends T_A[T_A[T_A[(Int,Int)]]]

val v_a: T_A[T_A[T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
}
}