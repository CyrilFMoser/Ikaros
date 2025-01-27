package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A[T_B[Boolean], T_B[Boolean]]) extends T_A[T_B[T_B[Byte]], T_A[T_B[Byte], T_A[(Boolean,Char), Boolean]]]
case class CC_B[D](a: T_B[D], b: T_A[D, D]) extends T_B[D]
case class CC_C(a: Char, b: CC_A) extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: (T_B[CC_C],(CC_C,CC_C)), b: CC_C, c: Byte) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_C(_, _), _) => 1 
  case CC_B(CC_D(_, _, _), _) => 2 
  case CC_C(_, _) => 3 
  case CC_D(_, _, _) => 4 
}
}