package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_B(a: T_A[T_A[CC_A]], b: Byte) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_C() extends T_A[CC_B]

val v_a: T_A[T_A[T_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}