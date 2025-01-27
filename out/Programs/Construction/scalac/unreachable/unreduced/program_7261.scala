package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],(Boolean,(Char,Int))), b: T_A[Int]) extends T_A[Int]
case class CC_B(a: Byte) extends T_A[Int]
case class CC_C(a: T_A[CC_A], b: CC_B, c: (T_A[Int],CC_A)) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),(_,_)), _) => 0 
  case CC_A((CC_B(_),(_,_)), _) => 1 
  case CC_A((CC_C(_, _, _),(_,_)), _) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, (CC_A(_, _),CC_A(_, _))) => 4 
  case CC_C(_, _, (CC_B(_),CC_A(_, _))) => 5 
  case CC_C(_, _, (CC_C(_, _, _),CC_A(_, _))) => 6 
}
}