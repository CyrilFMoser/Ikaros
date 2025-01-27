package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: (T_A[Int, Byte],T_A[Boolean, Char]), c: (T_A[Int, Boolean],(Byte,Int))) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C() extends T_A[(T_A[Char, Int],(Boolean,Boolean)), T_A[(T_A[Char, Int],(Boolean,Boolean)), (T_A[Char, Int],(Boolean,Boolean))]]

val v_a: T_A[(T_A[Char, Int],(Boolean,Boolean)), T_A[(T_A[Char, Int],(Boolean,Boolean)), (T_A[Char, Int],(Boolean,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), (_,_), (_,(_,_))) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}