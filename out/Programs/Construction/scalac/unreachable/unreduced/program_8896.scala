package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: D) extends T_A[D, Char]
case class CC_B[E]() extends T_B[E]
case class CC_C(a: T_B[T_A[Int, Int]], b: CC_A[Byte], c: (T_B[(Byte,Char)],T_A[Char, (Boolean,Boolean)])) extends T_B[CC_A[T_A[Int, Char]]]

val v_a: T_B[CC_A[T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, _), (CC_B(),_)) => 1 
}
}