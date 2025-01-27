package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Int],T_A[Boolean, Byte]), b: C, c: (T_A[(Boolean,Boolean), Char],T_A[Char, Int])) extends T_A[C, (T_A[Int, Byte],T_A[Boolean, Char])]
case class CC_B[D]() extends T_A[D, (T_A[Int, Byte],T_A[Boolean, Char])]

val v_a: T_A[Char, (T_A[Int, Byte],T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', (_,_)) => 0 
  case CC_A(_, _, (_,_)) => 1 
  case CC_B() => 2 
}
}