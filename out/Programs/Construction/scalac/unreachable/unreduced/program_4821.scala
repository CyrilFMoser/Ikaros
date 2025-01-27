package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,(Char,Char))], b: T_A[T_A[Char]], c: T_A[T_A[(Byte,Boolean)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: CC_A, c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, _, _)) => 2 
}
}