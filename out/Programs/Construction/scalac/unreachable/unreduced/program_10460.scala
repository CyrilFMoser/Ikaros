package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C(a: Int, b: CC_A) extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}