package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Char),Byte), b: T_A[Byte, C]) extends T_A[C, (T_A[Int, Char],(Boolean,Boolean))]
case class CC_B[D]() extends T_A[D, (T_A[Int, Char],(Boolean,Boolean))]

val v_a: T_A[Int, (T_A[Int, Char],(Boolean,Boolean))] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}