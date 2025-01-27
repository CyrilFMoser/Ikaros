package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Byte],T_A[Char]), b: Boolean) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_A[Char]]
case class CC_D() extends T_B[(Char,(Char,CC_C))]
case class CC_E() extends T_B[(Char,(Char,CC_C))]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}