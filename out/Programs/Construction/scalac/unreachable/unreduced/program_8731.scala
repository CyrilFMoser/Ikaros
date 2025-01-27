package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(Int,T_A[Int, Int]), ((Char,Byte),T_A[(Int,Boolean), Char])]
case class CC_B(a: T_A[CC_A[Int], (Char,Byte)], b: CC_A[CC_A[Int]], c: (CC_A[Int],CC_A[Int])) extends T_A[(Int,T_A[Int, Int]), ((Char,Byte),T_A[(Int,Boolean), Char])]
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_A[(Int,T_A[Int, Int]), ((Char,Byte),T_A[(Int,Boolean), Char])]

val v_a: T_A[(Int,T_A[Int, Int]), ((Char,Byte),T_A[(Int,Boolean), Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), (CC_A(),CC_A())) => 1 
  case CC_C(_) => 2 
}
}