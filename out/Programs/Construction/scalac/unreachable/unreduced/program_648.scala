package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Int]], b: T_A[T_B[Byte], Int]) extends T_A[T_A[T_B[Boolean], T_B[Boolean]], T_B[T_A[Int, (Byte,Int)]]]
case class CC_B() extends T_A[T_A[T_B[Boolean], T_B[Boolean]], T_B[T_A[Int, (Byte,Int)]]]
case class CC_C(a: T_B[(CC_A,(Boolean,Int))], b: CC_B, c: (Char,CC_A)) extends T_B[T_A[(CC_B,Byte), CC_B]]

val v_a: T_A[T_A[T_B[Boolean], T_B[Boolean]], T_B[T_A[Int, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}