package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]], b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B(a: T_A[CC_A[Boolean]], b: Boolean, c: T_A[CC_A[(Boolean,Int)]]) extends T_B[CC_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_B, c: Byte) extends T_B[CC_A[T_A[Int]]]
case class CC_D[D](a: T_B[Boolean], b: T_A[D], c: T_A[D]) extends T_B[CC_A[T_A[Int]]]

val v_a: T_B[CC_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, true, _) => 0 
  case CC_B(_, false, _) => 1 
  case CC_C(CC_B(_, _, _), _, 0) => 2 
  case CC_C(CC_B(_, _, _), _, _) => 3 
  case CC_D(_, _, _) => 4 
}
}