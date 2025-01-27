package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],T_A[Int])) extends T_A[T_A[T_A[Char]]]
case class CC_B[B]() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B[CC_B[CC_A]], b: Int) extends T_A[Int]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_C(_, _))) => 0 
  case CC_B() => 1 
}
}