package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Int, C]
case class CC_B(a: CC_A[CC_A[Char]], b: T_A[Int, ((Char,Byte),Char)], c: T_A[Int, Char]) extends T_A[Int, CC_A[T_A[Char, Boolean]]]
case class CC_C(a: T_A[(CC_B,CC_B), T_A[Int, CC_B]]) extends T_A[Int, CC_A[T_A[Char, Boolean]]]

val v_a: T_A[Int, CC_A[T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_) => 2 
}
}