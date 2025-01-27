package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B() extends T_B[T_A[T_A[Char]]]
case class CC_C() extends T_B[T_A[T_A[Char]]]
case class CC_D(a: ((CC_B,(Byte,Boolean)),CC_C), b: T_B[CC_B], c: T_A[Boolean]) extends T_B[T_A[T_A[Char]]]

val v_a: T_B[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(((_,_),CC_C()), _, CC_A(_)) => 2 
}
}