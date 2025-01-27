package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: T_A[D, E]) extends T_A[E, D]
case class CC_B(a: Byte, b: T_B[T_B[Boolean]]) extends T_B[T_A[T_A[Boolean, Char], CC_A[Int, Int]]]
case class CC_C(a: T_A[CC_A[Boolean, CC_B], ((Char,Int),CC_B)], b: T_B[(CC_B,CC_B)], c: (T_A[CC_B, Char],CC_A[Char, Byte])) extends T_B[T_A[T_A[Boolean, Char], CC_A[Int, Int]]]
case class CC_D(a: T_A[CC_B, Byte]) extends T_B[T_A[T_A[Boolean, Char], CC_A[Int, Int]]]

val v_a: T_B[T_A[T_A[Boolean, Char], CC_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_, _), _, (CC_A(_, _),CC_A(_, _))) => 1 
  case CC_D(_) => 2 
}
}