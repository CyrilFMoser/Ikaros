package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,Int), T_A[Char]]) extends T_A[T_B[Boolean, T_B[Int, (Byte,Int)]]]
case class CC_B(a: (Boolean,T_B[Char, CC_A]), b: T_A[T_A[CC_A]]) extends T_A[T_B[Boolean, T_B[Int, (Byte,Int)]]]

val v_a: T_A[T_B[Boolean, T_B[Int, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((true,_), _) => 1 
  case CC_B((false,_), _) => 2 
}
}