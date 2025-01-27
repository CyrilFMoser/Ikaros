package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Int,Int),T_A[(Int,Boolean), Char]), b: C, c: C) extends T_A[Int, C]
case class CC_B[D]() extends T_A[Int, D]
case class CC_C(a: T_A[Int, CC_B[Int]], b: Byte, c: Int) extends T_A[Int, CC_A[T_A[Int, Int]]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _, true) => 0 
  case CC_A(((_,_),_), _, false) => 1 
  case CC_B() => 2 
}
}