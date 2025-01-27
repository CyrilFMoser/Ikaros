package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[(T_A[Boolean, Byte],(Boolean,Byte)), C]
case class CC_B() extends T_A[(T_A[Boolean, Byte],(Boolean,Byte)), T_A[T_A[Char, Int], Boolean]]
case class CC_C[D, E](a: T_A[T_A[E, E], D], b: T_A[D, E], c: T_A[D, D]) extends T_A[(T_A[Boolean, Byte],(Boolean,Byte)), D]

val v_a: T_A[(T_A[Boolean, Byte],(Boolean,Byte)), T_A[T_A[Char, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}