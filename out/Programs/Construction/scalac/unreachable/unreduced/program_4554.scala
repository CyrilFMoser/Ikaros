package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Int,Byte), Int],(Boolean,Byte)), b: T_A[C, C], c: C) extends T_A[(T_A[(Boolean,Boolean), Int],Char), C]
case class CC_B[D]() extends T_A[(T_A[(Boolean,Boolean), Int],Char), D]

val v_a: T_A[(T_A[(Boolean,Boolean), Int],Char), Char] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), _, _) => 0 
  case CC_B() => 1 
}
}