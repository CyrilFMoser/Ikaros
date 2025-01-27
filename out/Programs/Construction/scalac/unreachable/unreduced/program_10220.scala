package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[D, T_A[(Byte,Char), T_A[Int, (Boolean,Byte)]]]
case class CC_B(a: (T_A[Byte, Int],T_B[Boolean])) extends T_B[T_B[Boolean]]
case class CC_C[E](a: T_B[E]) extends T_B[T_B[Boolean]]
case class CC_D(a: Char, b: CC_A[T_A[CC_B, CC_B]]) extends T_B[T_B[Boolean]]

val v_a: T_B[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_) => 1 
  case CC_D(_, _) => 2 
}
}