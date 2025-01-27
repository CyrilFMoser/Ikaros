package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[(Byte,Char), T_A[Int, Char]]]
case class CC_B() extends T_A[((Byte,(Int,Boolean)),(Int,(Int,Byte))), T_A[(Byte,Char), T_A[Int, Char]]]
case class CC_C(a: T_A[(Char,CC_B), CC_A[(Boolean,Byte)]]) extends T_A[((Byte,(Int,Boolean)),(Int,(Int,Byte))), T_A[(Byte,Char), T_A[Int, Char]]]

val v_a: T_A[((Byte,(Int,Boolean)),(Int,(Int,Byte))), T_A[(Byte,Char), T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}