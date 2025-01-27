package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: ((CC_A,T_B),(Boolean,T_B)), b: CC_A) extends T_B
case class CC_C(a: Byte) extends T_B
case class CC_D(a: T_B, b: T_A[T_A[(Int,Char)]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(((_,_),(_,_)), CC_A(CC_B(_, _))) => 0 
  case CC_B(((_,_),(_,_)), CC_A(CC_C(_))) => 1 
  case CC_B(((_,_),(_,_)), CC_A(CC_D(_, _))) => 2 
  case CC_C(0) => 3 
  case CC_C(_) => 4 
  case CC_D(_, _) => 5 
}
}