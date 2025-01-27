package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Byte, Int],T_A[Int, Boolean]), c: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: CC_A[D], b: T_A[D, Boolean]) extends T_A[D, Boolean]
case class CC_C[E](a: CC_A[E]) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _, _)), _) => 0 
  case CC_A(_, (_,CC_B(_, _)), _) => 1 
  case CC_A(_, (_,CC_C(_)), _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A(_, (_,_), _)) => 4 
}
}