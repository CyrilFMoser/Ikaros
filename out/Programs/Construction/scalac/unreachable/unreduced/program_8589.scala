package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[T_B[Boolean]], c: Boolean) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: CC_A) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: T_B[T_B[Byte]]) extends T_B[Byte]
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: D, b: T_B[D], c: (CC_B,CC_D[CC_C])) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_D()) => 0 
  case CC_C(CC_E(CC_C(_), CC_D(), _)) => 1 
  case CC_C(CC_E(CC_D(), CC_D(), _)) => 2 
  case CC_C(CC_E(CC_E(_, _, _), CC_D(), _)) => 3 
  case CC_C(CC_E(CC_C(_), CC_E(_, _, _), _)) => 4 
  case CC_C(CC_E(CC_D(), CC_E(_, _, _), _)) => 5 
  case CC_C(CC_E(CC_E(_, _, _), CC_E(_, _, _), _)) => 6 
  case CC_D() => 7 
  case CC_E(_, CC_D(), (CC_B(_, _),CC_D())) => 8 
  case CC_E(_, CC_E(_, _, _), (CC_B(_, _),CC_D())) => 9 
}
}
// This is not matched: CC_E(_, CC_C(_), (CC_B(_, _),CC_D()))