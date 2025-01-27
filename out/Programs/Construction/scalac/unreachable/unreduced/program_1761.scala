package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B[D](a: D, b: T_B[D], c: D) extends T_A[D]
case class CC_C(a: T_A[Boolean], b: Int) extends T_B[T_A[T_A[Byte]]]
case class CC_D(a: T_A[CC_B[CC_C]], b: CC_A[CC_C], c: CC_C) extends T_B[T_A[T_A[Byte]]]
case class CC_E(a: (T_A[CC_C],(CC_C,CC_D)), b: CC_A[CC_B[CC_C]], c: CC_C) extends T_B[T_A[T_A[Byte]]]

val v_a: T_B[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
  case CC_D(CC_A(_, _), CC_A(_, _), _) => 2 
  case CC_D(CC_B(_, _, _), CC_A(_, _), _) => 3 
  case CC_E(_, _, CC_C(_, _)) => 4 
}
}