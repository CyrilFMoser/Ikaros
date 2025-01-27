package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Boolean, b: Char) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[CC_B], b: (CC_B,CC_B)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, (CC_B(_, _),CC_B(_, _))) => 2 
}
}