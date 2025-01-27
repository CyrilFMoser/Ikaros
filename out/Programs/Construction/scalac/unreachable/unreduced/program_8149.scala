package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Byte],T_A[Int, Char]), b: C) extends T_A[T_A[Boolean, T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[Boolean, T_A[Char, Boolean]], D]

val v_a: T_A[T_A[Boolean, T_A[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}