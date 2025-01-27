package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: C) extends T_A[C]
case class CC_B[D](a: T_B[D], b: D) extends T_B[T_B[T_B[Int]]]
case class CC_C(a: (T_B[Char],Byte), b: Boolean, c: T_B[T_B[Boolean]]) extends T_B[T_B[T_B[Int]]]

val v_a: T_B[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((_,_), true, _) => 1 
  case CC_C((_,_), false, _) => 2 
}
}