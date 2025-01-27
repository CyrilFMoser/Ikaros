package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: T_B[T_A[Char]]) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_B[Byte], b: (T_B[Boolean],T_A[CC_A])) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: Byte) extends T_A[T_B[T_A[Int]]]
case class CC_D(a: CC_B, b: CC_C) extends T_B[T_B[Byte]]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, (_,_))