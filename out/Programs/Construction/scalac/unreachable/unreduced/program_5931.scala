package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int]) extends T_A[T_B[Byte]]
case class CC_B(a: T_A[T_B[CC_A]], b: (T_A[CC_A],T_A[CC_A])) extends T_A[T_B[Byte]]
case class CC_C(a: T_B[CC_B], b: Int, c: Byte) extends T_A[T_B[Byte]]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)