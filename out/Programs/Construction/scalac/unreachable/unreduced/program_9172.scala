package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], Char], b: T_A[T_A[(Boolean,Int), Char], Char]) extends T_A[Byte, T_A[(Byte,(Boolean,Byte)), Char]]
case class CC_B() extends T_A[Byte, T_A[(Byte,(Boolean,Byte)), Char]]
case class CC_C(a: (T_A[Int, Int],(CC_B,CC_A)), b: CC_A) extends T_A[Byte, T_A[(Byte,(Boolean,Byte)), Char]]

val v_a: T_A[Byte, T_A[(Byte,(Boolean,Byte)), Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((_,(_,_)), _) => 2 
}
}