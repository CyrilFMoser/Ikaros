package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: (T_B[Byte],T_A[Byte]), b: CC_A[D]) extends T_A[D]
case class CC_C(a: CC_B[Boolean]) extends T_A[T_A[Boolean]]
case class CC_D(a: CC_A[CC_A[Int]], b: T_A[T_A[Boolean]]) extends T_B[CC_A[Int]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), CC_A()) => 1 
  case CC_B((_,CC_B(_, _)), CC_A()) => 2 
  case CC_C(_) => 3 
}
}