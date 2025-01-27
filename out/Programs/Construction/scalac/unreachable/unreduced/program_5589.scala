package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: ((Boolean,Byte),Char), b: C, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_C(a: CC_B[CC_B[Byte]]) extends T_A[(T_A[Char],CC_B[Char])]
case class CC_D(a: CC_B[CC_A[CC_C]], b: T_B[T_A[CC_C]]) extends T_B[Byte]
case class CC_E[E]() extends T_B[Byte]
case class CC_F() extends T_B[Byte]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _, _) => 0 
  case CC_B(_, _) => 1 
}
}