package Program_23 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[T_A[Char]], c: T_A[T_A[(Byte,Boolean)]]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}